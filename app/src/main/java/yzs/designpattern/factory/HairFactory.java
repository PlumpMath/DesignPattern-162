package yzs.designpattern.factory;

/**
 * Created by 叶子叔 on 2016/4/13.
 */
public class HairFactory {

    public HairInterface getHair(String key){
        if("left".equals(key)){
            return new LeftHair();
        }else if("right".equals(key)){
            return new RightHair();
        }
        return  null;
    }

//    public <T> HairInterface getHair(Class<T> tClass){
//        try{
//            return tClass.newInstance();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}
