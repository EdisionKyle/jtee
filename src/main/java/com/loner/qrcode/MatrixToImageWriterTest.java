package com.loner.qrcode;

import java.io.File;
import java.util.Hashtable;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

public class MatrixToImageWriterTest {
	public static void main(String[] args) throws Exception {
		String text = "http://www.baidu.com 爱你";// 二维码的内容
		int width = 400;
		int height = 400;
		String format = "png";
		Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		BitMatrix bitMatrix = new MultiFormatWriter().encode(text,
				BarcodeFormat.QR_CODE, width, height, hints);
		File outputFile = new File("E://IMG//cnpay_loner.png");
		MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
		System.out.println("It is ok! 恭喜您，生成成功！");

		MatrixToImageWriter.decode();
	}
}