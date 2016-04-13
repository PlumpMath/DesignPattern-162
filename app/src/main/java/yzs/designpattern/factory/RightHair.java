package yzs.designpattern.factory;

import android.util.Log;

/**
 *
 * Created by 叶子叔 on 2016/4/13.
 */
public class RightHair implements HairInterface {
    @Override
    public void draw() {
        Log.i(HairInterface.TAG,"right hair");
    }
}
