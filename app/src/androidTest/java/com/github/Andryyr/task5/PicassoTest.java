package com.github.Andryyr.task5;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.github.Andryyr.task5.model.Pic;

import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class PicassoTest {

    private static final String PIC_URL = "https://pp.userapi.com/c850324/v850324354/efae2/l4LmBZJrj9M.jpg";

    @Test
    public void picassoTest() {
        RequestCreator rq = Picasso.get().load(PIC_URL);
        assertNotNull(rq);
    }

}
