/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

/**
 * RulesOf6005 represents the collaboration policy of 6.005 as described by the
 * general information on Stellar.
 */
public class RulesOf6005 {
     
    /**
     * Judge whether a given piece of code may be used in an assignment (problem
     * set or team project) or not, according to the 6.005 collaboration policy.
     * 
     * @param writtenByYourself true if the code in question was written by
     *        yourself or, in the case of a team project, your teammates,
     *        otherwise false.
     *        如果所讨论的代码是由你自己编写的，或者在团队项目中是由你的队友编写的，
     *        则为true，否则为false。
     * @param availableToOthers if not writtenByYourself, whether or not the
     *        code in question is available to all other students in the class.
     *        Otherwise ignored.
     *        如果你提交的代码不是你自己写的(writtenByYourself == false)，
     *        那么无论它是否是一个大家都能获取到的公共资源，
     *        系统或评审都会检查这段代码是否符合规定。
     * @param writtenAsCourseWork if not writtenByYourself, whether or not the
     *        code in question was written specifically as part of a solution to
     *        a 6.005 assignment, in the current or past semesters. Otherwise
     *        ignored.
     *        如果你提交的代码不是你自己写的(writtenByYourself == false)，
     *        那么不管这段代码是某个学期的 6.005 课程作业的一部分还是来自其他地方，
     *        都会被检查是否符合规定。
     * @param citingYourSource if not writtenByYourself, whether or not you
     *        properly cite your source. Otherwise ignored.
     *        如果代码不是你写的(writtenByYourself == false)，即使你有注明来源，
     *        系统或评审仍然会检查此代码是否符合规定。
     * @param implementationRequired whether the assignment specifically asks
     *        you to implement the feature in question.
     *        该作业是否明确要求你实现相关功能
     * @return Whether or not, based on the information provided in the
     *         arguments, you are likely to be allowed to use the code in
     *         question in your assignment, according to the 6.005 collaboration
     *         policy for the current semester.
     *         根据所提供的参数信息，依据本学期 6.005 课程的协作政策，
     *         你是否被允许在作业中使用这段代码。
     */
    public static boolean mayUseCodeInAssignment(boolean writtenByYourself,
            boolean availableToOthers, boolean writtenAsCourseWork,
            boolean citingYourSource, boolean implementationRequired) {
        
        // TODO: Fill in this method, then remove the exception
        
        if(writtenByYourself == true) {
            if(implementationRequired == true) {
                return true;
            }else {
                return false;
            }
        }else if (availableToOthers == true && writtenAsCourseWork == true && citingYourSource == true && implementationRequired == true) {
            return true;
        }else {
            return false;
        }
          
        
//        throw new RuntimeException("implement me!");
    }
    
    /**
     * Main method of the class.
     * 
     * Runs the mayUseCodeInAssignment method.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("You may certainly use code you wrote yourself: " +
            RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }
}
