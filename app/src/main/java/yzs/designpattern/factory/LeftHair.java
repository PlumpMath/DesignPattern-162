package yzs.designpattern.factory;

import android.util.Log;

/**
 * 子类别
 * Created by 叶子叔 on 2016/4/13.
 */
public class LeftHair implements HairInterface {

    @Override
    public void draw() {
        Log.i(HairInterface.TAG,"left hair");
    }
}
