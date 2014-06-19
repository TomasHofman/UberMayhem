package mayhem.plugin

import mayhem.application.ApplicationContext

/**
 * Created by Martin Macak on 19/06/14.
 */
trait Plugin {
  def attach(context:ApplicationContext)
}
