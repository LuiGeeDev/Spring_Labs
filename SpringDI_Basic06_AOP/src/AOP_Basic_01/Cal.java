package AOP_Basic_01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

/*
 * 간단한 계산기 프로그램
 * - 주관심(업무): 사칙 연산(ADD, MUL)
 * - 보조관심(공통사항): 연산에 걸린 시간
 * - log 출력 (console 출력: 시스템에서 출력하는 것처럼 RED 색으로)
 */

public class Cal {
  public int add(int x, int y) {
    Log log = LogFactory.getLog(this.getClass());
    StopWatch sw = new StopWatch();
    sw.start();
    log.info("타이머 시작");
    
    int result = x + y;
    
    sw.stop();
    log.info("타이머 종료");
    log.info("[TIME LOG] Method: ADD");
    log.info("[TIME LOG] Method TIME: " + sw.getTotalTimeMillis());
    
    return result;
  }
  
  public int mul(int x, int y) {
    Log log = LogFactory.getLog(this.getClass());
    StopWatch sw = new StopWatch();
    sw.start();
    log.info("타이머 시작");
    
    int result = x * y;
    
    sw.stop();
    log.info("타이머 종료");
    log.info("[TIME LOG] Method: ADD");
    log.info("[TIME LOG] Method TIME: " + sw.getTotalTimeMillis());
    
    return result;
  }
}
