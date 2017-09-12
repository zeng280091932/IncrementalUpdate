package tv.aroundme.update;

public class BsDiffTest {

	public static void main(String[] args) {
		BsDiff.bsDiff(Constanst.OLD_APK_PATH, Constanst.NEW_APK_PATH, Constanst.PATCH_PATH);
		System.out.println("app diff complete!");
	}

}
