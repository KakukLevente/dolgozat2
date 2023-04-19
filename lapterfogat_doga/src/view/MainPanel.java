/*
* File: App.java
* Author: Kakuk Levente
* Group: Szoft 1/1/N
* Date: 2023-04-06
* Github: https://github.com/KakukLevente/
* Licenc: GNU GPL
*/
package view;

import com.github.suli2022.inputlib.ButtonPanel;
import com.github.suli2022.inputlib.InputPanel;
import com.github.suli2022.inputlib.TitlePanel;

import javafx.scene.layout.VBox;

public class MainPanel extends VBox{
    TitlePanel titlePanel;
    InputPanel inputPanel;
    ButtonPanel buttonPanel;
    InputPanel resultPanel;
    public  MainPanel() {
        this.titlePanel=new TitlePanel();
        this.inputPanel=new InputPanel();
        this.buttonPanel=new ButtonPanel();
        this.resultPanel=new InputPanel();
        
        this.titlePanel.setText("Kocka térfogata");
        this.inputPanel.setText("lapátló: ");
        this.buttonPanel.setCalcButtonText("Számít");
        this.resultPanel.setText("Térfogat:");

        this.getChildren().add(this.titlePanel);
        this.getChildren().add(this.inputPanel);
        this.getChildren().add(this.buttonPanel);
        this.getChildren().add(this.resultPanel);
    }

    public InputPanel getInputPanel() {
        return inputPanel;
    }
    public ButtonPanel getButtonPanel() {
        return buttonPanel;
    }
    public InputPanel getResultPanel() {
        return resultPanel;
    }

}
