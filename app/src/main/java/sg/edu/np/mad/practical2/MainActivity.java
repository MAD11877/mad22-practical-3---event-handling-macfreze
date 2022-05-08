package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View.OnClickListener;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity{

    User u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent rec = getIntent();
        int value = rec.getIntExtra("id",0);
        u = new User();
        u.name = "MAD";
        u.description = "can we talk about the economical and political state of the world right now";
        u.id = 1;
        u.followed = false;

        TextView name =findViewById(R.id.txtName);
        name.setText(u.name + " " + value);
        TextView description = findViewById(R.id.txtDesc);
        description.setText(u.description);
        setFollowButton();


//        public void follow(View view){
//            TextView txt = findViewById(R.id.followButton);

//        }

    }
    private void setFollowButton() {
        Button b = findViewById(R.id.followButton);
        if (u.followed) {
            b.setText("Unfollow");
        } else {
            b.setText("Follow");
        }
    }

    public void onClickFollow(View view){
        u.followed = !u.followed;
        setFollowButton();
    }


}


