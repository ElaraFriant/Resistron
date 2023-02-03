package fr.simplon.resistronv1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import java.util.HashMap;

public class ResistronController {

/*
We will use HashMaps for each of our rings to be able to use String, Integer and Double variables in the same list.
We use Double to allow us to write all of our numbers.
 */

    HashMap<String, Integer> anneau1 = new HashMap<String, Integer>();
    HashMap<String, Integer> anneau2 = new HashMap<String, Integer>();
    HashMap<String, Double> anneau3 = new HashMap<String, Double>();
    HashMap<String, Double> anneau4 = new HashMap<String, Double>();

    /*
    In this part, we initialize the variable that will hold the value of each ring.
     */
    private int mvalueanneau1;

    private int mvalueanneau2;

    private double mvalueanneau3;

    private double mvalueanneau4;

/*
We have the skeleton of our grid with all the buttons, colors, text fields, labels, imageview, menu button,
menu items and grid pane.
 */
    @FXML
    Button mButtonArgent;

    @FXML
    Button mButtonBlanc;

    @FXML
    Button mButtonBleu;

    @FXML
    Button mButtonBrun;

    @FXML
    Button mButtonCalculer;

    @FXML
    Button mButtonGris;

    @FXML
    Button mButtonJaune;

    @FXML
    Button mButtonNoir;

    @FXML
    Button mButtonOr;

    @FXML
    Button mButtonOrange;

    @FXML
    Button mButtonRouge;

    @FXML
    Button mButtonVert;

    @FXML
    Button mButtonViolet;

    @FXML
    GridPane mGridPaneButtons;

    @FXML
    ImageView mImageViewResistance;

    @FXML
    Label mLabelAnneau1;

    @FXML
    Label mLabelAnneau2;

    @FXML
    Label mLabelMultiplicateur;

    @FXML
    Label mLabelOhms;

    @FXML
    Label mLabelPourcentage;

    @FXML
    Label mLabelResultat;

    @FXML
    Label mLabelTolerance;

    @FXML
    Label mLabelToleranceResultat;

    @FXML
    MenuButton mMenuButtonAnneaux;

    @FXML
    MenuItem mMenuItemAnneau1;

    @FXML
    MenuItem mMenuItemAnneau2;

    @FXML
    MenuItem mMenuItemMultiplicateur;

    @FXML
    MenuItem mMenuItemTolerance;

    @FXML
    TextField mTextFieldAnneau1;

    @FXML
    TextField mTextFieldAnneau2;

    @FXML
    TextField mTextFieldMultiplicateur;

    @FXML
    TextField mTextFieldResultat;

    @FXML
    TextField mTextFieldTolerance;

    @FXML
    TextField mTextFieldToleranceResultat;

    /*
    In this part, we initialize our method for each ring to insert the colors and values that they hold respectively.
     */

    @FXML
    private void initialize() {
        anneau1();
        anneau2();
        anneau3();
        anneau4();
    }
    /*In this part anneau1: we will declare each ring's color with their respective value.
     */
    private void anneau1() {

        anneau1.put("noir", 0);
        anneau1.put("brun", 1);
        anneau1.put("rouge", 2);
        anneau1.put("orange", 3);
        anneau1.put("jaune", 4);
        anneau1.put("vert", 5);
        anneau1.put("bleu", 6);
        anneau1.put("violet", 7);
        anneau1.put("gris", 8);
        anneau1.put("blanc", 9);
        anneau1.put("or", null);
        anneau1.put("argent", null);
    }
    /*In this part anneau2: we will declare each ring's color with their respective value.
     */
    private void anneau2() {

        anneau2.put("noir", 0);
        anneau2.put("brun", 1);
        anneau2.put("rouge", 2);
        anneau2.put("orange", 3);
        anneau2.put("jaune", 4);
        anneau2.put("vert", 5);
        anneau2.put("bleu", 6);
        anneau2.put("violet", 7);
        anneau2.put("gris", 8);
        anneau2.put("blanc", 9);
        anneau2.put("or", null);
        anneau2.put("argent", null);
    }
    /*In this part anneau3: we will register each ring's color with their respective value. We will see that in this line
    we are using a Double and math.pow wich will allown us to have decimal numbers and also potencial number.
    */
    private void anneau3() {
        anneau3.put("noir", Double.valueOf(1));
        anneau3.put("brun", Double.valueOf(10));
        anneau3.put("rouge", Double.valueOf(100));
        anneau3.put("orange", Double.valueOf(1000));
        anneau3.put("jaune", Double.valueOf(10000));
        anneau3.put("vert", Double.valueOf(100000));
        anneau3.put("bleu", Double.valueOf(1000000));
        anneau3.put("violet", Math.pow(10, 7));
        anneau3.put("gris", Math.pow(10, 8));
        anneau3.put("blanc", Math.pow(10, 9));
        anneau3.put("or", Math.pow(10, -1));
        anneau3.put("argent", Math.pow(10, -2));
    }
    /*In this part anneau4: we will register each ring's color with their respective value. We will see that in this part
    we are using a Double.valueof will allown us to have decimal numbers.
     */
    private void anneau4() {

        anneau4.put("noir", null);
        anneau4.put("brun", Double.valueOf(1));
        anneau4.put("rouge", Double.valueOf(2));
        anneau4.put("orange", null);
        anneau4.put("jaune", null);
        anneau4.put("vert", Double.valueOf(0.5));
        anneau4.put("bleu", Double.valueOf(0.25));
        anneau4.put("violet", Double.valueOf(0.10));
        anneau4.put("gris", Double.valueOf(0.05));
        anneau4.put("blanc", null);
        anneau4.put("or", Double.valueOf(5));
        anneau4.put("argent", Double.valueOf(10));
    }
/* In this part we create a fonction that will be able to :
First : select a ring
Second : select a color that holds the value to add to the chosen ring
Third : it will return the value in the according TextField.
 */

    @FXML
    private void onButtonClick(ActionEvent event) {

        Button button = (Button) event.getSource();
        String colorName = button.getText().toLowerCase();

        if (mNumeroAnneauCourant == 1) {
            mvalueanneau1 = anneau1.get(colorName);
        } else if (mNumeroAnneauCourant == 2) {
            mvalueanneau2 = anneau2.get(colorName);
        } else if (mNumeroAnneauCourant == 3) {
            mvalueanneau3 = anneau3.get(colorName);
        } else if (mNumeroAnneauCourant == 4) {
            mvalueanneau4 = anneau4.get(colorName);
        }

        mTextFieldAnneau1.setText(String.valueOf(mvalueanneau1));
        mTextFieldAnneau2.setText(String.valueOf(mvalueanneau2));
        mTextFieldMultiplicateur.setText(String.valueOf(mvalueanneau3));
        mTextFieldTolerance.setText(String.valueOf(mvalueanneau4));
        mTextFieldToleranceResultat.setText(String.valueOf(mvalueanneau4));

/* This part is to keep our TextFields uneditable by the user

 */
        mTextFieldAnneau1.setEditable(false);
        mTextFieldAnneau2.setEditable(false);
        mTextFieldMultiplicateur.setEditable(false);
        mTextFieldTolerance.setEditable(false);
        mTextFieldResultat.setEditable(false);
        mTextFieldToleranceResultat.setEditable(false);



    }
    /* This fonction will do the calculation of the resistane value when we click on the "Calculer" button.

     */
    @FXML
    public void onActionButtonCalculer(ActionEvent event) {
        Button button = (Button) event.getSource();
        mTextFieldResultat.setText(String.valueOf(((mvalueanneau1 * 10) + mvalueanneau2) * mvalueanneau3));

    }

    /* In this part we activate the MenuItems of our MenuButton to make them clickable

     */
    private int mNumeroAnneauCourant;

    @FXML
    private void onAnneau1Click() {
        mNumeroAnneauCourant = 1;
    }

    @FXML
    private void onAnneau2Click() {
        mNumeroAnneauCourant = 2;
    }

    @FXML
    private void onAnneau3Click() {
        mNumeroAnneauCourant = 3;
    }

    @FXML
    private void onAnneau4Click() {
        mNumeroAnneauCourant = 4;
    }
}