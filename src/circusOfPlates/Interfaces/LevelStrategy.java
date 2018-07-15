package circusOfPlates.Interfaces;

import java.io.File;

import circusOfPlates.model.AudioPlayer;

public interface LevelStrategy {

	public void getHarder();

	default void playLevelSound() {

		File file = new File(getClass().getResource("/circusOfPlates/supportMedia/newlevel.wav").getFile());
		String path = file.getAbsolutePath().replaceAll("%20", " ");
		AudioPlayer.main(null, path);
	}
}
