
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class DeBruijnCardTrick extends Application {
	private String finalAnswer = "";
	private static List<Card> orginalDeck = new ArrayList<Card>();
	private static List<Card> usedDeck = new ArrayList<Card>();
	private static Map<String, List<Card>> cardMap = new LinkedHashMap<String, List<Card>>();
	private static String DeBruijinSequence = "0000011000101001111010001110011011001001011111100001";
	private boolean retryFlag = true, proccedToAnswerFlag;

	public void start(Stage primaryStage) {
		setDecks();
		setMap();
		while(retryFlag) {
		this.enterAnswerBox();
		}
		if(this.proccedToAnswerFlag) {
			this.result();
		}
	}	
	public static void main(String[] args) {
		launch(args);
	}
	
	//Boxes
	public void enterAnswerBox() {
		TextInputDialog answerBox = new TextInputDialog();
		answerBox.setTitle("Answer");
		answerBox.setHeaderText(null);
		answerBox.setContentText("Enter your answer (0 is BLACK, 1 is RED): ");
		Optional<String> answer = answerBox.showAndWait();
		if(answer.isPresent()) {
			if (!this.isNullOrEmpty(answer.get())) {
				finalAnswer = answer.get();
				retryFlag = false;
				this.proccedToAnswerFlag = true;
			} else {
				this.noInputErrorDialog();			
			}
		}
		else {
			this.noInputErrorDialog();
		}
	}
	
	public void result() {
		Alert result = new Alert(AlertType.INFORMATION);
		result.setTitle("Result");
		result.setHeaderText(null);
		cardMap.keySet().forEach(a -> {
			if(a.equals(finalAnswer)) {
				result.setContentText(cardMap.get(a).toString());
				System.out.println(cardMap.get(a).toString());
			}
		});
		result.showAndWait();
	}

	
	public void noInputErrorDialog() {
		ButtonType retryButton = new ButtonType("Retry", ButtonBar.ButtonData.OK_DONE);
		ButtonType endButton = new ButtonType("End", ButtonBar.ButtonData.CANCEL_CLOSE);

		Alert error = new Alert(AlertType.ERROR);
		error.getDialogPane().getButtonTypes().setAll(retryButton, endButton);
		error.setTitle("No input!");
		error.setHeaderText("No input!");
		error.setContentText("Choose " + retryButton.getText() + " or " + endButton.getText());
		Optional<ButtonType> choice = error.showAndWait();
		if (choice.get() == endButton) {
			retryFlag = false;
			this.proccedToAnswerFlag = false;
		}
	}
	
	private boolean isNullOrEmpty(String text) {
		String textTrim = text.trim();
		if (text.isEmpty() || textTrim.length() == 0) {
			return true;
		}
		return false;
	}
	
	
			
	// Set up the Original Decks in order;
	public static void setDecks() {
		for (int i = 1; i <= 13; i++) {
			String name = "";
			if (i > 10) {
				switch (i) {
				case 11:
					name = "Jack";
					break;
				case 12:
					name = "Queen";
					break;
				case 13:
					name = "King";

					break;
				default:
					break;
				}
			} else {
				name = i + "";
			}
			setCard(name);
		}
		setUsedDeck();
	}

	public static void setUsedDeck() {
		//// Set the usedDeck
		usedDeck.add(orginalDeck.get(41));
		usedDeck.add(orginalDeck.get(0));
		usedDeck.add(orginalDeck.get(40));
		usedDeck.add(orginalDeck.get(29));
		usedDeck.add(orginalDeck.get(24));
		usedDeck.add(orginalDeck.get(36));
		usedDeck.add(orginalDeck.get(22));
		usedDeck.add(orginalDeck.get(15));
		usedDeck.add(orginalDeck.get(21));
		usedDeck.add(orginalDeck.get(47));
		usedDeck.add(orginalDeck.get(5));
		usedDeck.add(orginalDeck.get(18));
		usedDeck.add(orginalDeck.get(49));
		usedDeck.add(orginalDeck.get(9));
		usedDeck.add(orginalDeck.get(28));
		usedDeck.add(orginalDeck.get(6));
		usedDeck.add(orginalDeck.get(35));
		usedDeck.add(orginalDeck.get(39));
		usedDeck.add(orginalDeck.get(14));
		usedDeck.add(orginalDeck.get(44));
		usedDeck.add(orginalDeck.get(42));
		usedDeck.add(orginalDeck.get(37));
		usedDeck.add(orginalDeck.get(12));
		usedDeck.add(orginalDeck.get(31));
		usedDeck.add(orginalDeck.get(4));
		usedDeck.add(orginalDeck.get(7));
		usedDeck.add(orginalDeck.get(34));
		usedDeck.add(orginalDeck.get(48));
		usedDeck.add(orginalDeck.get(19));
		usedDeck.add(orginalDeck.get(3));
		usedDeck.add(orginalDeck.get(51));
		usedDeck.add(orginalDeck.get(27));
		usedDeck.add(orginalDeck.get(2));
		usedDeck.add(orginalDeck.get(13));
		usedDeck.add(orginalDeck.get(25));
		usedDeck.add(orginalDeck.get(38));
		usedDeck.add(orginalDeck.get(11));
		usedDeck.add(orginalDeck.get(46));
		usedDeck.add(orginalDeck.get(33));
		usedDeck.add(orginalDeck.get(23));
		usedDeck.add(orginalDeck.get(10));
		usedDeck.add(orginalDeck.get(20));
		usedDeck.add(orginalDeck.get(17));
		usedDeck.add(orginalDeck.get(30));
		usedDeck.add(orginalDeck.get(1));
		usedDeck.add(orginalDeck.get(32));
		usedDeck.add(orginalDeck.get(26));
		usedDeck.add(orginalDeck.get(50));
		usedDeck.add(orginalDeck.get(45));
		usedDeck.add(orginalDeck.get(8));
		usedDeck.add(orginalDeck.get(16));
		usedDeck.add(orginalDeck.get(43));
	}

	public static void setCard(String name) {
		for (int suitNum = 1; suitNum <= 4; suitNum++) {
			Card temp = new Card(name);
			temp.setSuit(suitNum);
			orginalDeck.add(temp);
		}
	}
	
	public static void setMap() {
		for (int trial = 0; trial < 47; trial++) {
			String subString = DeBruijinSequence.substring(trial, 6 + trial);
			List<Card> subSequenceCard = new ArrayList<Card>();
			for (int index = trial; index < trial + 6; index++) {
				subSequenceCard.add(usedDeck.get(index));
			}
			cardMap.put(subString, subSequenceCard);
		}

	}


}
