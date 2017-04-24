package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.io.*;
import javax.xml.ws.*;
import javax.xml.ws.http.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
