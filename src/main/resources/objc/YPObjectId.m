#import "YPObjectId.h"

@implementation YPObjectId

-(id)_id: (NSString*) _id
{
    __id = _id;

     return self;
}

- (id) initWithValues:(NSDictionary*)dict
{
    self = [super initWithValues:dict];
    if(self) {
        __id = dict[@"id"];
    }
    
        //_isLoaded = TRUE;
    return self;
}

-(NSDictionary*)asDictionary
{
    NSMutableDictionary* dict = [[NSMutableDictionary alloc] init];
    if(__id != nil) dict[@"id"] = __id ;
    
    NSDictionary* output = [dict copy];
    return output;
}

- (NSString*)get_idValue
{
    return __id;
}


@end