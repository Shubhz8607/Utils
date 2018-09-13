# Utils
============


* This will help us for checking that app is connected to Internet or not.
* It reduces the given below:

```java
public class Utils
{
    public static boolean checkInternet(Context context)
    {
        final String TAG = "Check Internet";

        ConnectivityManager connectivityManager =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (connectivityManager != null)
        {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected())
            {
                Log.d(TAG, "Internet is connected");
                return true;
            }
            else
            {
                Toast.makeText(context, "Internet is not connected", Toast.LENGTH_LONG).show();
                return false;
            }
        }
        else
        {
            Log.d(TAG, "ConnectivityManager was null");
        }

        return false;
    }

}
```



Just Do This
------------

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
	}
  ```
  
Step 2. Add the dependency

```groovy
	dependencies {
	        implementation 'com.github.Shubhz8607:Utils:2.0'
	}
  ```
