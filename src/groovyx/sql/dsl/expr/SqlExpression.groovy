/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package groovyx.sql.dsl.expr

/**
 *
 * @author Valery
 */
class SqlExpression {
    def SqlExpression() {
        println " SqlExpression constructor" 
    }
    def String toString() {
        "SqlExpression.toString()"
    }
    def String shortInfo(int level) {
        return "----- SHORT INFO -----\n-- className = " + this.getClass().simpleName
    }
}

