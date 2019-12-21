package youtube.chap02_Adapter.lib;

public class AdapterImpl implements Adapter{

	
	@Override
	public Float twiceOf(Float f) {
		// TODO Auto-generated method stub
		
		//return (float)Math.twoTime(f.doubleValue());
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		// TODO Auto-generated method stub
		
		return (float)Math.half(f.doubleValue());
	}
	
}
