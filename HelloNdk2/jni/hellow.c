#include<stdio.h>
#include<stdlib.h>
#include <string.h>
#include <jni.h>
#include <android/log.h>
#define TAG "nate"
#define LOGV(...) __android_log_print(ANDROID_LOG_ERROR, TAG, __VA_ARGS__)

JNIEXPORT void JNICALL Java_com_example_hellondk2_MainActivity_updateFile
  (JNIEnv *env, jclass jclass, jstring path){
 //生成native的char的指针
	const char * file_path=(*env)->GetStringUTFChars(env,path,NULL);
   if(file_path!=NULL){
	   LOGV("from c file_path %s",file_path);
   }
   //打开文件
   FILE*file=fopen(file_path,"a+");
   if(file!=NULL){
	   LOGV("from c open file success");
   }
   char data[]="I am boy";
   //写入文件
   int count = fwrite(data,strlen(data),1,file);
   if(count>0){
	   LOGV("form c write file succes");
   }
   //关闭文件
   if(file!=NULL){
	   fclose(file);
   }
   //释放资源
   (*env)->ReleaseStringUTFChars(env,path,file_path);
}


JNIEXPORT jintArray JNICALL Java_com_example_hellondk2_MainActivity_updateIntArray
  (JNIEnv *env, jclass jclass, jintArray array){

	jint nativeArray[5];
	(*env)->GetIntArrayRegion(env,array,0,5,nativeArray);

	int j;
	for(j=0;j<5;j++){
		nativeArray[j]+=5;
		LOGV("form c int %d",nativeArray[j]);
	}
	(*env)->SetIntArrayRegion(env,array,0,5,nativeArray);
    	return array;
}


JNIEXPORT jstring JNICALL Java_com_example_hellondk2_MainActivity_getStringFromC
  (JNIEnv *env,jclass jclass){

	LOGV("log from native111");

	return (*env)->NewStringUTF(env, "Hello Onefrom JNI !!!!");
}
//jstring Java_com_example_hellondk2_MainActivity_getStringFromC(JNIEnv* env,jobject obj){
//    jstring jstr=(*env)->NewStringUTF(env,"Hello");
//    return jstr;
//}
//jstring
//Java_com_example_hellondk2_MainActivity_getStringFromC( JNIEnv* env,
//                                                  jobject thiz )
//
//{
//	  return (*env)->NewStringUTF(env, "Hello from JNI !");
//}
