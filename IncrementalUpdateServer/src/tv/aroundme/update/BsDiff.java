package tv.aroundme.update;

public class BsDiff {
	public static native void bsDiff(String oldfile, String newfile, String patchfile);

	static {
		System.loadLibrary("BsDiff");
	}
}
