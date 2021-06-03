

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;    //URL指定
import javax.servlet.http.HttpServlet;     //HTTPを使ったサーブレットの基本的な機能
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/chapter3/hello"})  //WebServletアノテーション
public class Hello extends HttpServlet{    //サーブレットのクラスはpublic。パッケージ外部のアプリケーションサーバが使用するため

	public void doGet(   //doGetかdoPostメソッド をオーバーライド。アプリケーションサーバがしかるべきタイミングで自動で実行
			HttpServletRequest request, HttpServletResponse response    //引数二つ //HttpServletResponseインタフェース（クラスじゃない）。
	) throws ServletException, IOException{  //例外。throwsはどのような例外が伝播される可能性があるかメソッドに指定（p.399）。呼び出し元はアプリケーションサーバ
		PrintWriter out=response.getWriter();  //HttpServletResponseインタフェースのgetWriterメソッド
		out.println("Hello!");     //出力
		out.println(new java.util.Date());
	}
}
