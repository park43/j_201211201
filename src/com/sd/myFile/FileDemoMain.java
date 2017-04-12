package com.sd.myFile;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.File;

public class FileDemoMain{
  public static void main(String[] args){
    
    File readme=null;
    InputStream isReadme=null;
    InputStreamReader isrReadme = null;
    BufferedReader brReadme = null;
    String str;
    
    try{  //File������� �ݵ�� ����ó���� �־�� �Ѵ�.
      int i;
      File myhome=new File(System.getProperty("user.home"));
      System.out.println("my home is "+myhome);
      
      String cwd=new File(" . ").getCanonicalPath();//���� ���丮
      System.out.println("current working dir is " + cwd);
      
      readme = new File(cwd,"hello.txt");
      System.out.println("readme file is " + readme);
      
      isReadme = new FileInputStream(readme);
      System.out.println("Characters printed : ");
      while((i=isReadme.read()) !=-1){ //�ǹٸ� ���ڶ�� 0~255  ���� �ǹ��ϴ� EOF�� -1�� ��� �ڹٴ� EOF
        System.out.print((char)i);
      }
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      if(isReadme != null)
        isReadme.close();
    }
    
    try{
      isReadme = new FileInputStream(readme);
      isrReadme = new InputStreamReader(isReadme,"UTF8");
      brReadme=new BufferedReader(isrReadme);
      while((str=brReadme.readLine())!=null){
        System.out.println("--" + str);
      }
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      if(brReadme !=null)
        brReadme.close();
    }
  }
}
  
