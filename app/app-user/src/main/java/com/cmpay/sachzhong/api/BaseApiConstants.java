
package com.cmpay.sachzhong.api;

public interface BaseApiConstants {


	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/9 14:10
	 * @info :表示请求被服务器正常处理
	 *
	 */
	Integer HTTP_200_CODE = 200;


	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/9 14:10
	 * @info :表示请求已成功处理，但是没有内容返回
	 *
	 */
	Integer HTTP_204_CODE = 204;


	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/9 14:10
	 * @info :表示服务器已经完成了部分GET请求（客户端进行了范围请求）
	 *
	 */
	Integer HTTP_206_CODE = 206;


	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/9 14:10
	 * @info :永久重定向，表示请求的资源已经永久的搬到了其他位置
	 *
	 */
	Integer HTTP_301_CODE = 301;


	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/9 14:10
	 * @info : 临时重定向，表示请求的资源临时搬到了其他位置
	 *
	 */
	Integer HTTP_302_CODE = 302;


	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/9 14:10
	 * @info :表示请求资源存在另一个URI，应使用GET定向获取请求资源
	 *
	 */
	Integer HTTP_303_CODE = 303;


	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/9 14:10
	 * @info :表示请求报文存在语法错误或参数错误，服务器不理解
	 *
	 */
	Integer HTTP_400_CODE = 400;


	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/9 14:10
	 * @info :表示对请求资源的访问被服务器拒绝了
	 *
	 */
	Integer HTTP_403_CODE = 403;


	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/9 14:10
	 * @info :HTTP401错误代表用户没有访问权限，需要进行身份认证
	 *
	 */
	Integer HTTP_401_CODE = 401;


	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/9 14:10
	 * @info :表示服务器找不到你请求的资源
	 *
	 */
	Integer HTTP_404_CODE = 404;


	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/9 14:10
	 * @info :表示服务器执行请求的时候出错了
	 *
	 */
	Integer HTTP_500_CODE = 500;


	/**
	 * @author SachZhong 钟盛勤
	 * @date 2020/6/9 14:10
	 * @info :表示服务器超负载或正停机维护，无法处理请求
	 *
	 */
	Integer HTTP_503_CODE = 503;

}
