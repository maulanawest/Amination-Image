# Amination-Image
animation image click

### Priview
![animate](https://user-images.githubusercontent.com/43386555/58544962-8ac74d80-822c-11e9-88d0-b601315af97a.gif)


### 1. mainactivity.xml
    <ImageView
        android:id="@+id/ironman"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:onClick="fade"
        android:src="@drawable/ironman" />

    <ImageView
        android:id="@+id/tony"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:alpha="0"
        android:onClick="fade"
        android:src="@drawable/toni" />
        
### 2. MainActivity.java
      public class MainActivity extends AppCompatActivity {

          ImageView ironman, tony; //variable public

          @Override
          protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_main);

              //initializ
              ironman = (ImageView) findViewById(R.id.ironman);
              tony = (ImageView) findViewById(R.id.tony);
          }

          //method onclick generate from xml (alt+enter or mac comment + enter)
          public void fade(View view) {

              ironman.animate().alpha(0.f).setDuration(2000);
              tony.animate().alpha(1.f).setDuration(2000);

          }
      }
