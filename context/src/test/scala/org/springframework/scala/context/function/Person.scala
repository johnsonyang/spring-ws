/*
 * Copyright 2011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.scala.context.function

/**
 * @author Arjen Poutsma
 */
class Person(val firstName: String, val lastName: String) {
	
	var father: Person = null
	var mother: Person = null

	override def toString = firstName + " " + lastName
}

class InitializablePerson(firstName: String, lastName: String)
		extends Person(firstName, lastName) {

	var initialised = false

	def initialize() {
		initialised = true
	}

	def destroy() {
		initialised = false
	}
}