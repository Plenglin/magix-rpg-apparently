package io.github.plenglin.magix.ability.exception

class AbilityFailureException(message: String) extends Exception(message) {

  def this() = this("Ability failed")

}