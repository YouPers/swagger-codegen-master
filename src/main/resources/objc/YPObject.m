#import "YPObject.h"

@implementation YPObject

- (id) initWithValues:(NSDictionary*)dict
{
    _isLoaded = TRUE;
    return self;
}

- (NSDictionary*) asDictionary{
    return [[NSDictionary alloc] init];
}

- (NSString*)description {
    return [NSString stringWithFormat:@"%@ %@", [super description], [self asDictionary]];
}

-(id) initWithObjectId:(NSString*)objectId
{
    self = [super init];
    if(self) {
        _isLoaded = FALSE;
        __idObj = objectId;
    }

    return self;
}

@end
