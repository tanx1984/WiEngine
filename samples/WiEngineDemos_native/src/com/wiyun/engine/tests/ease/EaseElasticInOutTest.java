package com.wiyun.engine.tests.ease;

import com.wiyun.engine.WiEngineTestActivity;

public class EaseElasticInOutTest extends WiEngineTestActivity {
	private native void nativeStart();

	@Override
	protected void runDemo() {
		nativeStart();
	}
}
