package com.yx.cdss.extract.provider.util;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import java.util.UUID;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: FileUtil
 * @Desc: TODO
 * @history v1.0
 */
public class FileUtil {

    public static final String _EMPTY_FILE_TYPE = "NOT";


    public static String generateUUIDfileName(String originFileName){
        if(originFileName ==null){
            throw new RuntimeException("{FileUtil-->createNewFileName(String originFileName)}==>UUID文件名称异常,源文件名称不能为空！");
        }
        String uuid = UUID.randomUUID().toString().replace("-","");
        originFileName = originFileName.replace(".","~~");
        String[] array = originFileName.split("~~");
        int len = array.length;
        String fileType = null;
        if(len <= 1){
            fileType = "";
        }else{
            fileType = "."+array[len-1];
        }
        return uuid+fileType;
    }


    public static String generateUUIDfileName(FileTypeEnum fileType){
        if(fileType ==null){
            throw new RuntimeException("{FileUtil-->createNewFileName(String originFileName)}==>UUID文件名称异常,源文件名称不能为空！");
        }
        StringBuffer buff = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-","");
        buff.append(uuid);
        if(!FileTypeEnum.EMPTY.equals(fileType)){
            buff.append(".");
            buff.append(fileType.toString().toLowerCase());
        }
        return buff.toString();
    }

    public static void main(String[] args) {
        //String fileName = generateUUIDfileName(FileTypeEnum.DOC);
        //System.out.println(fileName);
        String fileName = generateUUIDfileName("test.png");
        System.out.println(fileName);

    }
}
