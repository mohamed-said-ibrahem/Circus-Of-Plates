package circusOfPlates.model;

import circusOfPlates.Interfaces.LevelStrategy;
import circusOfPlates.controller.CircusCtrl;

public class Level3 implements LevelStrategy {

	private CircusCtrl circusCtrl;

	public Level3(CircusCtrl cirCtrl) {

		circusCtrl = cirCtrl;
	}

	@Override
	public void getHarder() {

		circusCtrl.setNumOfColor(10);
		circusCtrl.activeMoveBars();
		playLevelSound();
	}

}
