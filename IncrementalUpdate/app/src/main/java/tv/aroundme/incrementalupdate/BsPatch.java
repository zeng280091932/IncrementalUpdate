package tv.aroundme.incrementalupdate;

/**
 * @author zengjiantao
 * @since 2017/8/19
 */
public class BsPatch {
    public static native void bsPatch(String oldFile, String newFile, String patchFile);

    static {
        System.loadLibrary("bspatch");
    }
}
