package utils;


import org.bytedeco.opencv.opencv_imgproc.*;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import java.util.ArrayList;
import java.util.List;

public class ImageComparison {

    public static void compareAndHighlightDifferences(String refImagePath, String testImagePath, String outputImagePath) {
        // Load reference and test images
        Mat img1 = Imgcodecs.imread(refImagePath);
        Mat img2 = Imgcodecs.imread(testImagePath);

        if (img1.empty() || img2.empty()) {
            System.out.println("Error: One or both images are missing!");
            return;
        }

        // Compute absolute difference
        Mat diff = new Mat();
        Core.absdiff(img1, img2, diff);

        // Convert to grayscale
        Mat grayDiff = new Mat();
        Imgproc.cvtColor(diff, grayDiff, Imgproc.COLOR_BGR2GRAY);

        // Apply threshold to highlight differences
        Mat thresholdImg = new Mat();
        Imgproc.threshold(grayDiff, thresholdImg, 50, 255, Imgproc.THRESH_BINARY);

        // Find contours (regions with differences)
        List<MatOfPoint> contours = new ArrayList<>();
        Mat hierarchy = new Mat();
        Imgproc.findContours(thresholdImg, contours, hierarchy, Imgproc.RETR_EXTERNAL, Imgproc.CHAIN_APPROX_SIMPLE);

        // Draw red rectangles around detected differences
        for (MatOfPoint contour : contours) {
            Rect boundingRect = Imgproc.boundingRect(contour);
            Imgproc.rectangle(img2, boundingRect.tl(), boundingRect.br(), new Scalar(0, 0, 255), 3);
        }

        // Save the output image with highlighted differences
        Imgcodecs.imwrite(outputImagePath, img2);
        System.out.println("Comparison completed! Differences highlighted in: " + outputImagePath);


    }

    public static boolean isElementPresent(String fullImagePath, String elementImagePath) {
        Mat fullImage = Imgcodecs.imread(fullImagePath);
        Mat element = Imgcodecs.imread(elementImagePath);

        Mat result = new Mat();
        Imgproc.matchTemplate(fullImage, element, result, Imgproc.TM_CCOEFF_NORMED);

        Core.MinMaxLocResult mmr = Core.minMaxLoc(result);
        return mmr.maxVal >= 0.8;  // Threshold for matching
    }

    public void usage(){

        // Run the Comparison
        ImageComparison.compareAndHighlightDifferences("screenshots/reference.png", "screenshots/test.png", "screenshots/differences.png");

        //Check if an Element Exists in a Screenshot
        boolean isButtonPresent = isElementPresent("screenshots/test.png", "screenshots/button.png");
        System.out.println("Button Found: " + isButtonPresent);


        //Highlight Differences (Mark UI Issues)

//        Imgproc.rectangle(img1, new Point(mmr.maxLoc.x, mmr.maxLoc.y),
//                new Point(mmr.maxLoc.x + element.cols(), mmr.maxLoc.y + element.rows()),
//                new Scalar(0, 0, 255), 3);
//        Imgcodecs.imwrite("screenshots/mismatch.png", img1);
    }
}