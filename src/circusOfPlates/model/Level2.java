package circusOfPlates.model;

import circusOfPlates.Interfaces.LevelStrategy;
import circusOfPlates.controller.CircusCtrl;

public class Level2 implements LevelStrategy{

	private CircusCtrl circusCtrl;

	public Level2(CircusCtrl cirCtrl) {
		
		circusCtrl = cirCtrl;
	}
	
	@Override
	public void getHarder() {

		circusCtrl.setNumOfColor(7);
		circusCtrl.setQueuePace(20);
		playLevelSound();
	}

}
