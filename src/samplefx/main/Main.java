package samplefx.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		Group root = new Group();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		
		Canvas canvas = new Canvas(800, 600);
		root.getChildren().add(canvas);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		gc.setFill(Color.RED);
		gc.setStroke(Color.BLACK);
		gc.setLineWidth(2);
		Font theFont = Font.font("Courier New", FontWeight.BOLD, 48);
		gc.setFont(theFont);
		gc.fillText("Hello, World!", 40, 50);
		gc.strokeText("Hello, World!", 40, 50);
		
		try {
			Scanner sc = new Scanner(new File("res/testfile.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		
		stage.setTitle("Hello World!");
		stage.show();
	}
	
}
