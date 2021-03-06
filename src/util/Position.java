package util;

public class Position extends OrderedPair{
	//private int x, y;
	public Position(float d, float e)
	{
		super(d,e);
	}
	
	public Position(Position pos)
	{
		super(pos.getX(), pos.getY());
	}
	
	@Override
	public boolean equals(Object x)
	{
		if(!(x instanceof Position)) return false;
		else
		{
			if(((Position)x).getX() == super.getX() && ((Position)x).getY() == super.getY())
			{
				return true;
			}
			else return false;
		}
	}
	public Position getPostionAsInt()
	{
		return new Position((int)this.getX(), (int)this.getY());
	}
}
