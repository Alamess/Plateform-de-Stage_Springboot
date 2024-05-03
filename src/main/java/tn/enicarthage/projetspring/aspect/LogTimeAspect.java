package tn.enicarthage.projetspring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.apache.commons.lang3.StringUtils;

@Aspect
@Component
public class LogTimeAspect {
    private static final Logger log = LogManager.getLogger(LogTimeAspect.class);

    @Around(value = "execution(* tn.enicarthage.projetspring.services..*(..))")
    public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.nanoTime();
        Object returnValue = joinPoint.proceed(); 
        long duration = System.nanoTime() - startTime;

        StringBuilder sb = new StringBuilder("KPI: ");
        sb.append("[").append(joinPoint.getKind()).append("] for: ").append(joinPoint.getSignature());
        sb.append(" withArgs: ").append("(").append(StringUtils.join(joinPoint.getArgs(), ",")).append(")");
        sb.append(" took: ").append(duration / 1_000_000).append(" ms."); 

        log.info(sb.toString());
        return returnValue;
    }
}
