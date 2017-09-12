package tv.aroundme.incrementalupdate;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private static final String SD_CARD_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator;

    private static final String TAG = "Debug";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bsPatch(View view) {
        new AsyncTask<Void, Void, Boolean>() {

            @Override
            protected Boolean doInBackground(Void... params) {
                //1、下载服务器pact号文件（省略）
                Log.d(TAG, "下载成功");
                //2、合并apk文件
                String patchFile = SD_CARD_PATH + "apk.patch";
                String oldFile = ApkUtils.getSourceApkPath(getApplicationContext(), getPackageName());
                String newFile = SD_CARD_PATH + "update_app_new.apk";
                BsPatch.bsPatch(oldFile, newFile, patchFile);
                Log.d(TAG, "合并完毕");
                Log.d(TAG, patchFile);
                Log.d(TAG, oldFile);
                Log.d(TAG, newFile);
                return true;
            }

            @Override
            protected void onPostExecute(Boolean result) {
                if (result) {
                    String newFile = SD_CARD_PATH + "update_app_new.apk";
                    ApkUtils.installApk(getApplicationContext(), new File(newFile));
                }
            }
        }.execute();
    }
}
