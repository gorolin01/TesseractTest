package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Main {

    public static void main(String[] args) throws TesseractException {

        Tesseract tesseract = getTesseract();
        File file = new File("A3-2s55-600x215.jpg");
        String result = tesseract.doOCR(file);
        System.out.println(result);

    }

    private static Tesseract getTesseract(){

        Tesseract Tesseract = new Tesseract();
        Tesseract.setDatapath("G:\\Program\\Tesseract\\tessdata");
        Tesseract.setLanguage("eng");
        Tesseract.setHocr(true);
        return Tesseract;
    }

}
