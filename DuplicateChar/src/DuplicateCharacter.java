
public class DuplicateCharacter {

	public static void main(String[] args) {
	String s = "Great Responsibility";
	int count;
	char[] str = s.toCharArray();
	for(int i=0;i<str.length-1;i++)
	{
		count = 1;  
		for(int j=i+1;j<=str.length-1;j++)
		{
			if(str[i]==str[j] && str[i]!=' ')
			{
				count++;
				str[j] = '0';
			}
				
		}
	
	
	if(count>1 && str[i]!=0)
	{
		System.out.println(str[i]);
	}
	}

	}

}
