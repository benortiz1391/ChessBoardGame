package chessGUI;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JComponent;
import chessPieces.Piece;

@SuppressWarnings("serial")
public class Board extends JComponent {
	
	public int turnCounter = 0;
	private static Image NULL_IMAGE = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
	
	private final int Square_Width = 65;
	public ArrayList<Piece> White_Pieces;
	public ArrayList<Piece> Black_Pieces;
	
	public ArrayList<DrawingShape> Static_Shapes;
	public ArrayList<DrawingShape> Piece_Graphics;
	
	public Piece Active_Piece;
	
	private final int rows = 8;
	private final int cols = 8;
	private Integer[][] BoardGrid;
	private String board_file_path = "images" + File.separator + "board.png";
	
	
	public void initGrid() {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				BoardGrid[i][j] = 0;
			}
		}
		
		
	}
	
	
	interface DrawingShape {
	    boolean contains(Graphics2D g2, double x, double y);
	    void adjustPosition(double dx, double dy);
	    void draw(Graphics2D g2);
	}

}
