package brave.qiu.factory;

import brave.qiu.dao.IFoodTypeDao;
/**
 * 用接口的引用装实现类的体
 * @author Administrator
 *
 */
public class TestFactory {
		//使用工厂创建对象
	private IFoodTypeDao foodTypeDao = BeanFactory.
			getInstance("foodtypeDao",IFoodTypeDao.class);
}
