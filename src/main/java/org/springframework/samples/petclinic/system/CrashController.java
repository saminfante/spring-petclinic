package org.springframework.samples.petclinic.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller used to showcase what happens when an exception is thrown Also see how a view that
 * resolves to "error" has been added ("error.html").
 */
@Controller
class CrashController {
  @GetMapping("/oops")
  public String triggerException() {
    throw new RuntimeException(
        "Expected: controller used to showcase what " + "happens when an exception is thrown");
  }
}
