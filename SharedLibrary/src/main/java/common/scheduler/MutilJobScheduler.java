package common.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MutilJobScheduler {
	private static final Logger logger = LoggerFactory.getLogger(MutilJobScheduler.class);
	
	/*Scheduler factory */
	private SchedulerFactory schedulerFactory;
	
	private List<Scheduler> schedulers;
	
}
