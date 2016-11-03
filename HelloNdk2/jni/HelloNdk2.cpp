#include <jni.h>
#include "com_example_hellondk2_MainActivity.h";

JNIEXPORT jstring JNICALL Java_com_example_hellondk2_MainActivity_getStringFromC
  (JNIEnv *env, jclass java_class){

	return env->NewStringUTF("helloWorld");
}
