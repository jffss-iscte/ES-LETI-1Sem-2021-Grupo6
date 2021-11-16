package ES_LETI_1Sem_2021_Grupo6.projetoEs;

import java.util.List;

import com.julienvey.trello.impl.TrelloImpl;
import com.julienvey.trello.impl.http.ApacheHttpClient;
import com.julienvey.trello.domain.Board;
import com.julienvey.trello.domain.TList;

public class Trello {

	String key= "0c5239eff21038d1191eb11906e8f0ec";
	String trelloAccessToken="b00fb2a4469ff1a76559af3db24eee2720b98429df59b0ffd4f7d34127c0cd1f";
	TrelloImpl trelloApi = new TrelloImpl(key, trelloAccessToken, new ApacheHttpClient());

	Board board;
	List<Board> member= trelloApi.getMemberBoards("mrcosiscte");{ 
		for (Board quadro : member){             
			System.out.println(quadro.getName()+ "-" +quadro.getId());
			board = trelloApi.getBoard(quadro.getId());
			List<TList> lists = board.fetchLists();
			for (TList lista : lists) {
				System.out.println(lista.getName()+"- "+ lista.getId()+"-"+lista.getIdBoard());   
			}
		}
	}
}

