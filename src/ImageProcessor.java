import java.util.Scanner;

public class ImageProcessor {
	/**
	 * Parameter imageFile holds the name of the image
	 * that will be manipulated. We will use W to denote the width and H to denote the height of the
	 * image.
	 * @param imageFile
	 */
	public ImageProcessor(String imageFile){
		int H = 0;
		int W = 0;
		
		//Read the contents of the image
		Scanner img = new Scanner(imageFile);
		
		//get the data
		int[][] pixelData = new int[H][W];
		
	}
	/**
	 * Returns a new Picture whose width is dx � We. Note that the type
	 * of this method must be Picture. Your method must use the algorithm described earlier to reduce
	 * the image width.
	 * @param x
	 * @return
	 */
	 public Picture reduceWidth(double x) {
		 return null;
	 }
}
