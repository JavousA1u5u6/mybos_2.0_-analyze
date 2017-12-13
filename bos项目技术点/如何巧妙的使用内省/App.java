package cn.itcast.utils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Date;

/**
 *CREATE BY LIGANG
 *2017-11-21
 */
/**
 * User
 * 		username
 * 		age
 * 		gender
 * 
 * String  hql = "from User where 1 =1" 
 * if(username !=null && !"".equals(username)){
 * 		hql += " and username like %"+user.getUsername()+"%";
 * }
 * if(age !=null && !"".equals(age)){
 * 		hql += " and age = "+user.getAge();
 * }
 * if(gender !=null && !"".equals(gender)){
 * 		hql += " and gender = "+user.getGender();
 * }
 * 	
 * 分析
 * 	User
 *  User 属性名
 *  User 属性值
 *  User 属性的类型
 * 
 * 内省
 * 	特殊的反射，研究的对象就是我们的模型类(pojo|domain)[对象里面的属性私有化声明并实现相应的getter/setter方法]
 * 
 * 	
 *
 */
public class App {
	
	public static void main(String[] args)throws Exception {
		User us = new User();
		us.setId(1);
		us.setUsername("LG");
		us.setBirthday(new Date());
		us.setGender(1);//男
		//获取所描述的目标对象
		BeanInfo beanInfo = Introspector.getBeanInfo(User.class,Object.class);
		//获取对象的属性描述器
		PropertyDescriptor[] props = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor prop : props) {
			//获取属性名
			//System.out.println(prop.getName());
			//获取属性类型
			//System.out.println(prop.getName()+","+prop.getPropertyType());
			//获取属性值
			Method readMethod = prop.getReadMethod();
			//通过反射获取方法的返回值
			Object obj = readMethod.invoke(us, null);
			//System.out.println(prop.getName()+","+obj);
			
			//.......
			if(null != obj && !"".equals(obj)){
				
				//判断类型是否未String, like,Integer =
				// and 属性名 = 属性值
				if(prop.getPropertyType() == Integer.class){
					System.out.println(prop.getName());
				}
				
			}
		}
	}
}
