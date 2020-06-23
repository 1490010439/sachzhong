
package com.cmpay.sachzhong.api;


/*
接口服务基础类
返回格式JSON
比如

{
		"code": "200",
		"msg": "正常请求",
		"time": "2019-09-31,18:56:12",
		"date": "564561561616516",
		"data": [{
		"name": "scahzong",
		"age": "18"
		}, {
		"name": "jayzhou",
		"age": "20"
		}]
}

*/




import com.cmpay.sachzhong.utils.SachZhongTimeutil;

import java.util.Date;
import java.util.List;

public class BaseApiService {

	private Api api =new Api();

	private SachZhongTimeutil timeUtil=new SachZhongTimeutil();

	public BaseApiService()
	{

	}

	public BaseApiService(int Code,String message,Object data)
	{
		api.setCode(Code);
		api.setMessage(message);
		api.setTime(timeUtil.getTime());
		api.setDate(new Date());
		api.setData(data);
	}

	public void initApi(int Code,String message,Object data)
	{
		api.setCode(Code);
		api.setMessage(message);
		api.setTime(timeUtil.getTime());
		api.setDate(new Date());
		api.setData(data);
	}

	public String ApiResult()
	{
		return api.toString();
	}

	public String  returnResult(Object ob,String title)
	{
		if(ob instanceof Integer)
		{
			if((int)ob==0 || "".equals(ob)||ob==null)
			{
				initApi(BaseApiConstants.HTTP_204_CODE,title+"-处理失败","null");
			}
			else
			{
				initApi(BaseApiConstants.HTTP_200_CODE,title+"-处理成功",ob);
			}
		}
		else  if(ob instanceof List)
		{
			if(ob==null|| ((List) ob).size()==0)
			{
				initApi(BaseApiConstants.HTTP_204_CODE,title+"-处理失败","null");
			}
			else
			{
				initApi(BaseApiConstants.HTTP_200_CODE,title+"-处理成功",ob);
			}
		}
		else
		{
			if(ob==null || "".equals(ob))
			{
				initApi(BaseApiConstants.HTTP_204_CODE,title+"-处理失败","null");
			}
			else
			{
				initApi(BaseApiConstants.HTTP_200_CODE,title+"-处理成功",ob);
			}
		}

		return ApiResult();
	}

}
