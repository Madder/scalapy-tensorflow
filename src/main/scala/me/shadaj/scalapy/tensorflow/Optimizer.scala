package me.shadaj.scalapy.tensorflow

import jep.Jep
import me.shadaj.scalapy.py
import me.shadaj.scalapy.py.ObjectFacade

class Optimizer(o: py.Object)(implicit jep: Jep) extends ObjectFacade(o) {
  def minimize(loss: Tensor): Operation = native

  def apply_gradients(grads_and_vars: Seq[(Tensor, Variable)]): Operation = native
}
