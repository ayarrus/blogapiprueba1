package com.ayarrus.apiblog.payload;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class PostResponse {
	private String title;
	private String body;
}
