package utility;

import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// See: https://metabroadcast.com/blog/getting-intellij-to-dislike-nulls-as-much-as-the-rest-of-us
// Credit: https://youtrack.jetbrains.com/oauth?state=%2Fissue%2FIDEA-125281
// Reasoning: @ParametersAreNonnullByDefault affects only parameters, not the return values...

/**
 * This annotation can be applied to a package, class or method to indicate that the class fields,
 * method return types and parameters in that element are not null by default unless there is:
 * The method overrides a method in a superclass (in which
 * case the annotation of the corresponding parameter in the superclass applies) there is a
 * default parameter annotation applied to a more tightly nested element.
 */
@Documented
@Nonnull
@TypeQualifierDefault(
        {
                ElementType.ANNOTATION_TYPE,
                ElementType.CONSTRUCTOR,
                ElementType.FIELD,
                ElementType.LOCAL_VARIABLE,
                ElementType.METHOD,
                ElementType.PACKAGE,
                ElementType.PARAMETER,
                ElementType.TYPE
        })
@Retention(RetentionPolicy.SOURCE)
public @interface NonNullByDefault {

}