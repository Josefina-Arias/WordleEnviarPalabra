package co.edu.poli.wordle.model;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import co.edu.poli.wordle.conector.ConectionCRUD;
import co.edu.poli.wordle.controller.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class Word {

	private ConectionCRUD consultas = new ConectionCRUD();

	public int id ;
	public String name;

	public Word() {

	}

	public Word(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Palabra [id=" + id + ", name=" + name + "]";
	} 

 
	
	public void insufficientWords(Word word, TextArea text) {

		if(word.getName().length() < 5) {
		text.setVisible(true);
		}
		
		scheduleDelayTask1(text);

	}
	
	public static void scheduleDelayTask1(TextArea text)
	{
	    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
	    Runnable task1 = () -> text.setVisible(false) ;
	    service.schedule(task1, 1, TimeUnit.SECONDS);
	}
	
	public void checkWord(Word word, TextArea text) {

		if(consultas.consultar(word) == 0 && word.getName().length() == 5) {
			text.setVisible(true);
		}
		
		scheduleDelayTask1(text);
	
	}
	
	public boolean skipLine(int word) {
		
		boolean answer = false;
		if(word == 1) {		
			
			 answer = true;	
		}
		
		return answer;
		
	}
	

}
