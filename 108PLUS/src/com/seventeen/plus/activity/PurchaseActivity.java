package com.seventeen.plus.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import cn.sharesdk.sina.weibo.SinaWeibo;

import com.google.gson.Gson;
import com.lidroid.xutils.BitmapUtils;
import com.seventeen.config.AppConfigInterface;
import com.seventeen.config.HttpGetJson;
import com.seventeen.config.HttpGetJson.OnGetJson;
import com.seventeen.plus.bean.Purchasess;

public class PurchaseActivity extends Activity implements OnClickListener {
	private ImageView mIv_headimg;
	private TextView mTv_title, mTv_dateBusiness, mTv_nameBusiness, mBuy_note,
			mTv_moreTaocan;
	private RadioButton servicePhone;
	private Purchasess fromJson;
	private ImageView mIv_back, mIv_share;
	private Button mBuymorebtn, mBtn_taocan;
	private WebView wv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.purcharse);
		initView();
		Intent intent = getIntent();
		String id = intent.getStringExtra("id");
		Log.i("id_purch", "--" + id);
		downjson(id);

	}

	private void initView() {
		ShareSDK.initSDK(this);
		wv = (WebView) findViewById(R.id.wv_produict_detail);
		mBtn_taocan = (Button) findViewById(R.id.ComboMore);
		mTv_moreTaocan = (TextView) findViewById(R.id.buyNOte_tacan);
		mIv_back = (ImageView) findViewById(R.id.back_purchase);
		mIv_headimg = (ImageView) findViewById(R.id.headImg_purchase);
		mTv_title = (TextView) findViewById(R.id.title_purchase);
		mTv_dateBusiness = (TextView) findViewById(R.id.date_business);
		mTv_nameBusiness = (TextView) findViewById(R.id.name_businiess);
		servicePhone = (RadioButton) findViewById(R.id.phoneService_purchase);
		mBuy_note = (TextView) findViewById(R.id.buy_note);
		mBuymorebtn = (Button) findViewById(R.id.buyMorebtn_note);
		mIv_share = (ImageView) findViewById(R.id.iv_share);

		mIv_back.setOnClickListener(this);
		mBtn_taocan.setOnClickListener(this);
		servicePhone.setOnClickListener(this);
		mBuymorebtn.setOnClickListener(this);
		mIv_share.setOnClickListener(this);

	}

	private void downjson(String id) {
		String url = AppConfigInterface.PURCHARSE + id;
		Log.i("id_url", "--" + url);
		HttpGetJson.getJson(this, url, new OnGetJson() {

			@Override
			public void getString(String json) {
				Log.i("purchajson", "--" + json);
				fromJson = new Gson().fromJson(json.toString(),
						Purchasess.class);
				String headImg = fromJson.getData().getHeadImg();
				Log.i("headimg", "--" + headImg);
				String headimgurl = "http://pic.108tian.com/pic/" + headImg;
				Log.i("headimgurl", "--" + headimgurl);
				downimage(headimgurl);
				initData(fromJson);
			}

		});
	}

	protected void downimage(final String headImgurl) {

		if (headImgurl.equals("")) {
			mIv_headimg
					.setImageResource(R.drawable.merchant_info_default_background);
		} else {
			BitmapUtils bitmapUtils = new BitmapUtils(PurchaseActivity.this);
			bitmapUtils.display(mIv_headimg, headImgurl);
		}

	}

	private void initData(Purchasess purchasess) {
		mTv_title.setText(purchasess.getData().getName());
		mTv_nameBusiness.setText(purchasess.getData().getContact().getName());
		mBuy_note.setText(purchasess.getData().getPurchaseNote().get(0)
				.getValue());
		mTv_moreTaocan.setText(purchasess.getData().getFee().getDetail());

		// WebSettings webSettings = wv.getSettings();
		// webSettings.setJavaScriptEnabled(true);
		wv.loadData(purchasess.getData().getContent(),
				"text/html;charset=utf-8", null);
	}

	@Override
	public void onClick(View v) {
		// Auto-TODOgenerated method stub
		switch (v.getId()) {
		case R.id.phoneService_purchase:
			Intent phoneIntent = new Intent(Intent.ACTION_CALL);
			String phone = fromJson.getData().getContact().getPhone();
			phoneIntent.setData(Uri.parse("tel:" + phone));
			startActivity(phoneIntent);
			break;

		case R.id.back_purchase:
			finish();
			break;
		case R.id.buyMorebtn_note:
			Intent moreIntent = new Intent(PurchaseActivity.this,
					MoreBuyNoteActivity.class);
			moreIntent.putExtra("attention", fromJson.getData()
					.getPurchaseNote().get(0).getValue());
			moreIntent.putExtra("suit", fromJson.getData().getPurchaseNote()
					.get(1).getValue());
			startActivity(moreIntent);
			break;
		case R.id.ComboMore:
			Intent comboIntent = new Intent(PurchaseActivity.this,
					MoreTaocanActivity.class);
			comboIntent.putExtra("comMore", fromJson.getData().getFee()
					.getDetail());
			startActivity(comboIntent);
			break;
		case R.id.iv_share:
			Platform weibo = ShareSDK.getPlatform(this, SinaWeibo.NAME);
			weibo.SSOSetting(true);

			OnekeyShare oks = new OnekeyShare();

			oks.setTitle("分享标题");
			oks.setText("分享内容，55555555");
			oks.show(this);
			break;

		}
	}
}
